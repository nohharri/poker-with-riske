import Banner.Banner
import Header.Header
import Body.Body
import Footer.Footer
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable



fun main() {
    var count: Int by mutableStateOf(0)
    renderComposable(rootElementId = "root") {
        Style(WebStyleSheet)
        Div(attrs = { classes(WebStyleSheet.main) }) {
            Div(attrs = { classes(WebStyleSheet.horizontalAlign) }) {
                Div(attrs = { classes(WebStyleSheet.page) }) {
                    Header()
                    Banner()
                    Body()

                }
            }
            Footer()
        }
    }
}

