# ThreadAbstraction

[![](https://jitpack.io/v/Krumuvecis/ThreadAbstraction.svg)](https://jitpack.io/#Krumuvecis/ThreadAbstraction)

by [Krumuvecis](https://github.com/Krumuvecis)

Free to use and modify for whatever purposes. No copyrights apply.


## Requirements

* JDK: 18
* Maven compiler: 18
* Maven Surefire: 3.0.0-M7
* jetbrains annotations: 23.0.0
* [DelayCalculator](https://github.com/Krumuvecis/DelayCalculator) : 0.4.1
* JUnit: Jupiter 5.9.0-M1 *(has dependency, but not really used; can remove from `pom.xml`)*


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
