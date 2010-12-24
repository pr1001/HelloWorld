package net.lift_modules {
package HelloWorld {

import net.liftweb.sitemap.{Menu, SiteMap}
import net.liftweb.http.{LiftRules, S}

object HelloWorld {
    def init() {
        LiftRules.addToPackages("net.lift_modules.HelloWorld")
        SiteMap.addMenusAtEndMutator(Menu(S ? "Hello World") / "helloworld" :: Nil)
    }
}


}
}
/*

in Boot.scala

import net.lift_modules.HelloWorld.HelloWorld

HelloWorld.init

val sitemap = HelloWorld.menu :: Nil

LiftRules.setSiteMap(SiteMap(sitemap: _*))

email david about init method 
-> changing the structure of Boot for Menu building

*/