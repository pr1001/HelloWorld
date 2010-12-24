package net.lift_modules {
package HelloWorld {

import net.liftweb.sitemap.{Menu, SiteMap}
import net.liftweb.http.{LiftRules, S}
import net.liftweb.sitemap.Loc.Template 

object HelloWorld {
    def init() {
        LiftRules.addToPackages("net.lift_modules.HelloWorld")
        val menu = Menu(S ? "Hello World") / "helloworld" >> Template(() => {
            <lift:surround with="default" at="content">
                <lift:HelloWorld.sayHello />
            </lift:surround>
        })
        val mutator = SiteMap.addMenusAtEndMutator(menu :: Nil)
        LiftRules.siteMap.foreach(sitemap => LiftRules.setSiteMap(mutator(sitemap)))
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