import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import eu.wewox.minabox.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MinaBox",
    ) {
        App()
    }
}
