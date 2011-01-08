# HelloWorld Lift Module

HelloWorld is a Lift Module (the first in fact) and illustrates how you can package useful code so that it can be easily reused in any [Lift](http://www.liftweb.net) project. It follows the Lift Module convention and adds a Hello World page to the end of the SiteMap of any Lift project which includes it. You can get a simple Lift application which uses this module at [HelloWorldExampleApp](https://github.com/pr1001/HelloWorldExampleApp).

## Using this module

This module uses Scala 2.81 and Lift 2.3-SNAPSHOT. You can use this module in your own Lift application either by checking out this project, building it using sbt (optionally changing the versions of Scala and Lift you wish to target), and then installing it in your local repository. Alternatively, you may add the `"net.lift_modules" %% "helloworld" % "1.0"` dependency and `http://maven.bubblefoundry.com` repository to your own project.

## Lift Modules

Lift modules must follow a set of simple common conventions so that users can easily and confidently add them to their own apps. There is no minimum version of Lift required for Lift modules, though Lift 2.2 introduced SiteMap mutators which make it easier for modules to register themselves in the SiteMap. The conventions are as follows:

- The module must have a package name that ends in its module name. For example: `net.lift_modules.HelloWorld`
- There must be an object with the module's name that the Lift app using it can import in Boot.scala. Given this usage, you may want to place its source file in `src/main/scala/bootstrap/lift_modules/ModuleName.scala` but this isn't required. The object might be imported like so: `import net.lift_modules.HelloWorld.HelloWorld`
- The object must have an `init` method which returns nothing and is called in the Lift app's Boot.scala to initialize the module. Every possible effort should be taken to automatically gather all necessary information, whether from the main Lift app or from props files, so that the init method can be called like so: `ModuleName.init`. However, it is acceptable for the init method to take parameters if there is no better alternative. Naturally this must be documented for module users.

Further information is available on [Lift's Modules wiki page](http://www.assembla.com/wiki/show/liftweb/Modules).

## Authors

This HelloWorld module was written by [Peter Robinett](http://www.bubblefoundry.com). The Lift Module conventions were developed by the [Lift community](http://groups.google.com/group/liftweb/), including Richard, George, and David.
