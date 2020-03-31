apply(plugin = "java-library")

dependencies {
  api(project(":gradle-demo:module-demo1"))
  api(project(":gradle-demo:module-demo2"))
}
