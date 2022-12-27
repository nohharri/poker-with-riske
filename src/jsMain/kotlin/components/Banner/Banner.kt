package Banner

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.media


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

                attrs = { classes(WebStyleSheet.bannerBig) ; classes(WebStyleSheet.box) }
            ){
                Div(attrs = {
                    classes(WebStyleSheet.headersmol)
                    style{
                        padding(20.px,40.px,20.px,40.px)
                    }
                }){

                    Text("Simplify, don't sacrifice.")
                }
                Div(attrs = {classes(WebStyleSheet.description)
                    style{
                        padding(20.px,40.px,20.px,40.px)
                    }
                }){
                    Text("We provide our students with simple strategies that don't sacrifice EV.")
                }
            }
            //2 boxes below
            Div(attrs = { classes(WebStyleSheet.bannerSmall)
                style {

                }
            }) {

                //apply
                A("https://pokerwithriske.typeform.com/to/fVw6HVJc?typeform-source=www.pokerwithriske.com") {
                    Div(attrs = {
                        classes(WebStyleSheet.headersmol)
                        classes(WebStyleSheet.verticalAlign)
                        classes(WebStyleSheet.box)
                        //classes(WebStyleSheet.smallBox)
                        style {
                            textAlign("center")
                            background("#F65665")
                            padding(20.px,40.px,20.px,40.px)
                            marginBottom(20.px)
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
                            padding(20.px,40.px,20.px,40.px)
                            marginBottom(20.px)

                        }
                    }
                ) {
                    Text("Meet our Coaches")
                }
            }
        }
        //image
        Div(
            attrs = {classes(WebStyleSheet.bannerImg)}
        ) {
            Img(src="https://www.pokerchips.com/media/wysiwyg/PokerChips/custom-poker-chips_3.png")
        }
    }
}


