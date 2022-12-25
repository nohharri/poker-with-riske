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
        Div(
            attrs = { classes(WebStyleSheet.box) }
        ) {
            //logo
            Div(
                attrs = {
                    style {
                        fontSize(64.px)
                        fontWeight(700)
                        property("font-family","Inter,Helvetica")
                    }
                }
            ) {
                Text("PWR")
            }
            //login
            Div(
                attrs = {
                    style {
                        fontSize(36.px)
                        fontWeight(700)
                        property("font-family","Poppins,Helvetica")
                        textDecoration("underline")
                    }
                }
            ) {
                Text("Login")
            }
        }
}
