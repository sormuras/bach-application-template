# 📋 Minimal modular Java project template using Bach.java

This template repository only contains a single project-defining source file:

- **`module-info.java`** in `src/com.github.sormuras.bach.template/main/java`
  ```java
  module com.github.sormuras.bach.template {}
  ```

This project also provides a [GitHub Actions](https://github.com/features/actions)-based workflow configuration file: [build.yml](.github/workflows/build.yml).
It demonstrates the installation-free build feature of Bach.java by via [JShell](https://docs.oracle.com/en/java/javase/11/tools/jshell.html).
```shell
 jshell https://sormuras.de/bach-build
```

## Summary

```text
Project bach.template
	name: bach.template
	version: null
	realms: 1
	units: 1
	Realm main
		Unit com.github.sormuras.bach.template
			module: com.github.sormuras.bach.template
			info: src/com.github.sormuras.bach.template/main/java/module-info.java
			Module Descriptor com.github.sormuras.bach.template
				 main: -
				 requires: []
```
