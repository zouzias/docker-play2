package controllers

import models.Message
import models.Message._
import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, Controller}

/**
 * Health check endpoint
 */
object HealthCheck extends Controller {

  def ping: Action[AnyContent] = Action {
    Ok(Json.toJson(Message("pong")))
  }

}

