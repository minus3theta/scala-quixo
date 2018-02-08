import scala.swing._

class UI extends MainFrame {
  title = "GUI Program"
  preferredSize = new Dimension(320, 240)
  contents = Button("Pohe") {println("Thank you") }
}

object Quixo {
  def main(args: Array[String]) {
    val ui = new UI
    ui.visible = true
  }
}