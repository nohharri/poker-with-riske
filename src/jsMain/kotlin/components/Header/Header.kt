package Header

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.alignSelf
import org.jetbrains.compose.web.css.AlignSelf
import org.jetbrains.compose.web.renderComposable
import Login.Login


@Composable
fun Header() {
    //var visible: Boolean = true;
        Div(
            attrs = { classes(WebStyleSheet.header) ; style{paddingTop(50.px)} }
        ) {
            //logo
            Div(attrs = { classes(WebStyleSheet.logo) }) {
                Text("PWR")
            }
            //login
            Login()
        }
}
