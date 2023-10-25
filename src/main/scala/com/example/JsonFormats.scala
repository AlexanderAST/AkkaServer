package com.example

import com.example.UserRegistry.{ActionPerformed, CounterPerformed}
import spray.json.RootJsonFormat

//#json-formats
import spray.json.DefaultJsonProtocol

object JsonFormats  {
  // import the default encoders for primitive types (Int, String, Lists etc)
  import DefaultJsonProtocol._

  implicit val userJsonFormat: RootJsonFormat[User] = jsonFormat3(User.apply)
  implicit val usersJsonFormat: RootJsonFormat[Users] = jsonFormat1(Users.apply)

  implicit val actionPerformedJsonFormat: RootJsonFormat[ActionPerformed] = jsonFormat1(ActionPerformed.apply)
  implicit val actionCountetPerformedJsonFormat:RootJsonFormat[CounterPerformed] = jsonFormat1(CounterPerformed.apply)
}
//#json-formats
