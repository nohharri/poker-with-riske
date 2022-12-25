package Banner

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.css.*


@Composable
fun Banner() {
    Div(
        attrs = { classes(WebStyleSheet.banner) }
    ) {
        //left side
        Div(
            attrs = {
                style {
                    flexDirection(FlexDirection.Column)
                    display(DisplayStyle.Flex)
                    flexWrap(FlexWrap.Wrap)
                    alignItems(AlignItems.Stretch)
                    width(700.px)
                }
            }
        ) {
            //description
            Div(
                attrs = {
                    style {
                    }
                }
            ){
                Div(attrs = {
                    style {
                        fontSize(36.px)
                        fontWeight(700)
                        property("font-family","Poppins,Helvetica")
                    }
                }){
                    Text("Simplify, don't sacrifice.")
                }
                Div(attrs = {
                    style {
                        fontSize(32.px)
                        fontWeight(500)
                        property("font-family", "Poppins,Helvetica")
                    }
                }){
                    Text("We provide our students with simple strategies that don't sacrifice EV.")
                }
            }
            //2 boxes below
            Div(attrs = {
                style {
                    flexDirection(FlexDirection.Row)
                    display(DisplayStyle.Flex)
                }
            }) {

                //apply
                Div(

                ) {
                    Text("Apply Now")
                }
                //meet
                Div(
                    attrs = {
                        style {
                        }
                    }
                ) {
                    Text("Apply Now")
                }
            }
        }
        //image
        Div(
            attrs = {
                style {

                }
            }
        ) {
            Img(src="https://www.pokerchips.com/media/wysiwyg/PokerChips/custom-poker-chips_3.png")
        }
    }
}


