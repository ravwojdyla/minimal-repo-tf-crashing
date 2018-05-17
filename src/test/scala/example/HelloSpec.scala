package example

import org.scalatest._
import org.tensorflow.TensorFlow

class HelloSpec extends FlatSpec {
  "TF" should "crash on cross test" in {
    TensorFlow.version()
  }
}
