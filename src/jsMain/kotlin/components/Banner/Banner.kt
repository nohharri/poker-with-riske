package Banner

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*


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
                }
            }
        ) {
            //description
            Div(
                attrs = { classes(WebStyleSheet.box)
                    style {
                        width(700.px)
                        height(290.px)
                    }
                }
            ){
                Div(attrs = {
                    classes(WebStyleSheet.headersmol)
                    style{padding(40.px)}
                }){

                    Text("Simplify, don't sacrifice.")
                }
                Div(attrs = {classes(WebStyleSheet.description) ; style{padding(40.px)}}){
                    Text("We provide our students with simple strategies that don't sacrifice EV.")
                }
            }
            //2 boxes below
            Div(attrs = {
                style {
                    flexDirection(FlexDirection.Row)
                    display(DisplayStyle.Flex)
                    alignItems(AlignItems.Stretch)
                    justifyContent(JustifyContent.SpaceBetween)
                    paddingTop(20.px)
                }
            }) {

                //apply
                A("https://pokerwithriske.typeform.com/to/fVw6HVJc?typeform-source=www.pokerwithriske.com") {
                    Div(attrs = {
                        classes(WebStyleSheet.headersmol)
                        classes(WebStyleSheet.verticalAlign)
                        classes(WebStyleSheet.box)
                        style {
                            textAlign("center")
                            width(284.px)
                            height(89.px)
                            background("#F65665")
                        }
                    }) {

                        Text("Apply Now")

                    }
                }
                //meet
                Div(
                    attrs = {
                        classes(WebStyleSheet.headersmol)
                        classes(WebStyleSheet.verticalAlign)
                        classes(WebStyleSheet.box)
                        style {
                            textAlign("center")
                            width(391.px)
                            height(89.px)

                        }
                    }
                ) {
                    Text("Meet our Coaches")
                }
            }
        }
        //image
        Div(
            attrs = {
                style {
                    width(807.px)
                    //height(654.px)
                    textAlign("center")
                }
            }
        ) {
            Img(src="https://www.pokerchips.com/media/wysiwyg/PokerChips/custom-poker-chips_3.png")
        }
    }
}


