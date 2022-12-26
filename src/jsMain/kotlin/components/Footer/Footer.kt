package Footer

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.alignSelf
import org.jetbrains.compose.web.css.AlignSelf
import org.jetbrains.compose.web.renderComposable


@Composable
fun Footer() {
    Div(attrs={
        style{
            height(279.px)
            width(100.percent)
            background("#090F26")
            marginTop(200.px)
            display(DisplayStyle.Flex)
            justifyContent(JustifyContent.Center)
            flexDirection(FlexDirection.Column)
        }
    }){
        //logo
        Div(attrs={classes(WebStyleSheet.logo); style{property("color","#797979") ; textAlign("center")}}){
            Text("PWR")
        }
        A("https://www.pokerwithriske.com/terms-and-conditions/") {

            Div(attrs = {
                classes(WebStyleSheet.description); style {
                property(
                    "color",
                    "#797979"
                ); textAlign("center")
                textDecoration("underline")
                fontSize(20.px)
            }
            }) {
                Text("Terms and Conditions | Privacy Policy | © Poker with Riske. Copyright 2022. All rights reserved.")
            }
        }
    }
}