package net.liftmodules {
package HelloWorld {

import net.liftweb.sitemap.{Menu, SiteMap}
import net.liftweb.http.{LiftRules, S}
import net.liftweb.sitemap.Loc.Template 

object HelloWorld {
    def init() {
        LiftRules.addToPackages("net.liftmodules.HelloWorld")
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
