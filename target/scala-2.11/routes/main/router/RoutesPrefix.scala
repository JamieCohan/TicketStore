
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/TicketStore/conf/routes
// @DATE:Tue Apr 11 13:34:24 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
