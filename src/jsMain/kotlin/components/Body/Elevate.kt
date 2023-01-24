package Elevate

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.alignSelf
import org.jetbrains.compose.web.css.AlignSelf
import org.jetbrains.compose.web.renderComposable

@Composable
fun Elevate() {
    Div(attrs = { classes(WebStyleSheet.Elevate) }) {
        Div(attrs = { classes(WebStyleSheet.headerbig);classes(WebStyleSheet.verticalAlign);classes(WebStyleSheet.mobileHeader); style { height(200.px) } }) {
            Text("Elevate Your Game")
        }
        A("https://pokerwithriske.typeform.com/to/fVw6HVJc?typeform-source=www.pokerwithriske.com") {
            Div(attrs = {
                classes(WebStyleSheet.headersmol)
                classes(WebStyleSheet.verticalAlign)
                classes(WebStyleSheet.box)
                classes(WebStyleSheet.applyBox)
                classes(WebStyleSheet.hoverbox)

            }) {
                Text("Apply Now")
            }
        }
    }
}