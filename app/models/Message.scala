package models

import play.api.libs.json.Json

case class Message(msg: String)

object Message{
  implicit val locationFormat = Json.format[Message]
}
