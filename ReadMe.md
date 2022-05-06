# ThreadAbstraction

by [Krumuvecis](https://github.com/Krumuvecis)

Free to use and modify for whatever purposes. No copyrights apply.


<h2>Requirements</h2>

* JDK: 17.0.2
* Maven compiler: 17
* Maven Surefire: 3.0.0-M5
* JUnit: Jupiter 5.8.2 *(has dependency, but not really used; can remove from `pom.xml`)*
* [DelayCalculator](https://github.com/Krumuvecis/DelayCalculator) : 0.2


<h2>Instructions</h2>

For single use **AbstractThread** :
1. Create an `object` that extends `AbstractThread`.
   * Use `update()` for custom actions.
   * *(Optional)* override `finish()` for custom ending.
2. Start by calling `object.start()`.
3. Has to be re-created upon every re-use.

For cyclical **AbstractUpdater** :
1. Create an `object` that extends `AbstractUpdater`.
   * *3 constructors available.*
   * Use `update()` for custom actions.
   * Use `delayCalculator` for custom delay preferences.
   * *(Optional)* override `finish()` for custom ending.
   * *(Optional)* override `endCheck()` for custom end-checking.
2. Start by calling `object.start()`.
3. Stop by calling `object.end()`.


<h2>Notes</h2>

<i>Latest working version available at `master` branch.</i>

<i>Development happening at `develop` branch.</i>