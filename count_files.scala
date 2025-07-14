//> using scala 3.7.1
//> using dep "com.lihaoyi::os-lib:0.11.4"

// os.pwd returns the current working directory
// os.list returns a list of files in the specified directory
// paths.length gives the count of files in that directory

@main
def countFiles(): Unit =
  val paths = os.list(os.pwd)
  println(s"Number of files: ${paths.length}")
  paths.foreach(path => println(s"File: ${path.toString}"))