How to Import User Packages in Java
===================================

**Class file (to be imported)**
- declare it as a package on the first line --> `package box_package;`
- no `main()` method

**Test file (to be run)**
- declare it as a package --> `package test_package;`
- import the class file --> `import box_package.*;`
- make sure it has a `main()` method

**File Structure**
- both `.java` files are in working directory
- built files (packages) are in `build` directory
- packages are what is "compiled" and what you execute

**Command Line**
- `javac -d build *.java` = compile all `.java` files to destination directory `build`
- `cd build` = go into `build` directory
- `java test_package.Test` = execute the Java byte code of `Test.java` in the package `test_package`

**Notes**
- you can only import packages in Java, you don't import classes
- `.java` files get compiled to packages, which contain byte code