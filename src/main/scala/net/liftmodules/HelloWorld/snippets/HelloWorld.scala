package net.liftmodules {
package HelloWorld {
package snippet {

import scala.xml.NodeSeq

class HelloWorld {
    def sayHello(xhtml: NodeSeq): NodeSeq = {
        <h1>Hello World!</h1>
    }
}

}
}
}