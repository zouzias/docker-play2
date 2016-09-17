package controllers

import play.api.libs.concurrent.Promise
import play.api.libs.iteratee.Enumerator
import play.api.mvc._

import play.api.libs.concurrent.Execution.Implicits._

object Application extends Controller {

  def index = Action {
    Ok("Your new application is ready.")
  }

  def enum = Action {
    Ok.chunked(Enumerator("hello\n"))
  }

  def generateM = Action {
    Ok.chunked(Enumerator.generateM(Promise.timeout(Some("hello\n"), 500)))
  }

  def repeatM = Action {
    Ok.chunked(Enumerator.repeatM(Promise.timeout("hello\n", 500)))
  }

  def interleave = Action {
    val hello = Enumerator.generateM(Promise.timeout(Some("hello\n"), 500))
    val goodbye = Enumerator.generateM(Promise.timeout(Some("goodbye\n"), 2000))

    val body = Enumerator.interleave(hello, goodbye)

    Ok.stream(body)
  }

  def andThen = Action {
    val hello = Enumerator("hello\n")
    val goodbye = Enumerator("goodbye\n")

    val body = hello.andThen(goodbye)

    Ok.chunked(body)
  }
}
