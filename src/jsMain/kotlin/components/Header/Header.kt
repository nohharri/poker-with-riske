package Header

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.alignSelf
import org.jetbrains.compose.web.css.AlignSelf
import org.jetbrains.compose.web.renderComposable


@Composable
fun Header() {
    //var visible: Boolean = true;
        Div(
            attrs = { classes(WebStyleSheet.box) ; style{paddingTop(50.px)} }
        ) {
            //logo
            Div(attrs = {classes(WebStyleSheet.logo)}) {
                Text("PWR")
            }
            //login
            Div(
                attrs = {classes(WebStyleSheet.headersmol)
                    style {
                        textDecoration("underline")
                        //padding(20.px)
                    }
                }
            ) {
                //Login()
                /*visible &&*/ Text("Login")
            }
        }
}
