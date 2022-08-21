# ThreadAbstraction

[![](https://jitpack.io/v/KruMF/ThreadAbstraction.svg)](https://jitpack.io/#KruMF/ThreadAbstraction)

by [Krumuvecis](https://github.com/Krumuvecis)

Free to use and modify for whatever purposes. No copyrights apply.


## Requirements

* JDK: 18
* Maven compiler (source & target) : 18
* [Maven Surefire Plugin](https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-surefire-plugin) : 3.0.0-M7
* [JetBrains Java Annotations](https://mvnrepository.com/artifact/org.jetbrains/annotations) : 23.0.0
* [DelayCalculator](https://github.com/KruMF/DelayCalculator) : 0.5.2


## Instructions

For single use **AbstractThread** :
1. Create an `object` that `extends AbstractThread`.
   * Implement `object.update()` for custom actions.
   * *(Optional)* override `object.finish()` for custom ending.
2. Start by calling `object.start()`.
3. *Note:* `object` has to be re-created upon every re-use.

For cyclical **AbstractUpdater** :
1. Create an `object` that `extends AbstractUpdater`.
   * *3 constructors available.*
   * Implement `object.update()` for custom actions.
   * Use `object.delayCalculator` for custom delay preferences.
   * *(Optional)* override `object.finish()` for custom ending.
   * *(Optional)* override `object.endCheck()` for custom end-checking.
2. Start by calling `object.start()`.
3. Stop by calling `object.end()`.


## Notes

<i>Latest working version available at `master` branch.</i>

<i>Development happening at `develop` branch.</i>
