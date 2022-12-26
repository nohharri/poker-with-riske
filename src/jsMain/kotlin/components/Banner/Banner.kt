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


                }
            }


        ) {
            //description
            Div(
                attrs = {
                    style {
                        width(700.px)
                        height(290.px)
                        background("rgba(28, 53, 95, 0.53)")
                        //boxShadow("0px 4px 23px 8px rgba(0, 0, 0, 0.25) inset 0px 4px 1px rgba(255, 255, 255, 0.25)")
                        borderRadius(20.px)
                        property("box-shadow", "0px 4px 23px 8px rgba(0, 0, 0, 0.25)")
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
                Div(attrs = {
                    classes(WebStyleSheet.headersmol)
                    style {
                        textAlign("center")
                        width(284.px)
                        height(89.px)
                        background("#F65665")
                        //boxShadow("0px 4px 23px 8px rgba(0, 0, 0, 0.25) inset 0px 4px 1px rgba(255, 255, 255, 0.25)")
                        borderRadius(20.px)
                    }
                }) {
                    Text("Apply Now")
                }
                //meet
                Div(
                    attrs = {
                        classes(WebStyleSheet.headersmol)
                        style {
                            textAlign("center")
                            width(391.px)
                            height(89.px)
                            background("#1C355F")
                            //boxShadow("0px 4px 23px 8px rgba(0, 0, 0, 0.25) inset 0px 4px 1px rgba(255, 255, 255, 0.25)")
                            borderRadius(20.px)

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
                    width(654.px)
                    height(807.px)
                    textAlign("center")
                }
            }
        ) {
            Img(src="https://www.pokerchips.com/media/wysiwyg/PokerChips/custom-poker-chips_3.png")
        }
    }
}


