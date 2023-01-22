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
                    classes(WebStyleSheet.mobileHeader)
                    style{
                        padding(20.px,40.px,10.px,40.px)
                    }

                }){

                    Text("Simplify, don't sacrifice.")
                }
                Div(attrs = {classes(WebStyleSheet.description)
                    style{
                        padding(10.px,40.px,20.px,40.px)
                    }
                }){
                    Text("We are a Coaching for Profits program that specializes in 6-max cash games." +
                            " In our experience the CFP model is the best coaching model as the student’s " +
                            "and coaches goals are completely aligned. ")

                }
                Div(attrs = {classes(WebStyleSheet.description)
                    style{
                        padding(10.px,40.px,20.px,40.px)
                    }
                }) {
                    Text("Our goal is to equip our students with the necessary skills required to move " +
                            "up to the highest stakes. To achieve this we teach a theoretically sound approach " +
                            "that uses efficient simplifications to achieve an implementable winning strategy.")
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
                        classes(WebStyleSheet.applyBox)
                        classes(WebStyleSheet.hoverbox)

                    }) {

                        Text("Apply Now")

                    }
                }
                //meet
                A("#Offer") {

                    Div(
                        attrs = {
                            classes(WebStyleSheet.headersmol)
                            classes(WebStyleSheet.verticalAlign)
                            classes(WebStyleSheet.box)
                            classes(WebStyleSheet.offerBox)
                            classes(WebStyleSheet.hoverbox)
                        }
                    ) {
                        Text("What We Offer")
                    }
                }
            }
        }
        //image
            Img(src="pokerchips.png",
                attrs = {classes(WebStyleSheet.bannerImg)})

    }
}


