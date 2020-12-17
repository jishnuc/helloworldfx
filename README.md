# helloworldfx
# sample

JavaFX 15 samples to run with different options and build tools.

Download [JDK 11 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory.

Make sure to install the jmods package as well, if installing openjdk through linux package manager

### Ex: Fedora
    sudo dnf search openjdk
    sudo dnf install java-latest-openjdk-devel.x86_64
    sudo dnf install java-latest-openjdk-jmods.x86_64

## jlink- Brief Introduction
jlink is a tool that generates a custom Java runtime image that contains only the platform modules that are required for a given application.

Such a runtime image acts exactly like the JRE but contains only the modules we picked and the dependencies they need to function. The concept of modular runtime images was introduced in JEP 220.

They take less disk space and start faster than the full JVM

Custom JDK + JavaFX image

    export PATH_TO_FX_MODS=path/to/javafx-jmods-15.0.1
    $JAVA_HOME/bin/jlink --module-path $PATH_TO_FX_MODS \
    --add-modules java.se,javafx.fxml,javafx.web,javafx.media,javafx.swing \
    --bind-services --output /path/to/jdkfx-15.0.1.jdk


## Modular - Maven

`helloworldfx` sample modular project to run with Maven

### Linux / Mac

If you run on Linux or Mac, follow these steps:

    mvn clean javafx:run

To create and run a custom JRE:

    mvn clean javafx:jlink
    target/helloworldfx/bin/launcher

### Windows

If you run on Windows, follow these steps:

    mvn clean javafx:run

To create and run a custom JRE:

    mvn clean javafx:jlink
    target\helloworldfx\bin\launcher


### Refernces

[openjfx](https://openjfx.io/openjfx-docs/#introduction)

[openjfx/samples](https://github.com/openjfx/samples)

[containerizing apps with jlink](https://blogs.oracle.com/javamagazine/containerizing-apps-with-jlink)