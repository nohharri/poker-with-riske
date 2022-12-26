package Body

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.alignSelf
import org.jetbrains.compose.web.css.AlignSelf
import org.jetbrains.compose.web.renderComposable


@Composable
fun Body() {
    Div(
        attrs = {
            style{
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Row)
                justifyContent(JustifyContent.Center)
            }
        }
    ) {

        Div(
            attrs = { classes(WebStyleSheet.body) }
        ) {
            //header 1
            Div(attrs = { classes(WebStyleSheet.headerbig); style { textAlign("center") } }) {
                Text("Meet Our Coaches")
            }
            //sample coach
            Div(
                attrs = {
                    style {
                        display(DisplayStyle.Flex)
                        flexDirection(FlexDirection.Row)
                        justifyContent(JustifyContent.SpaceBetween)

                    }
                }
            ) {
                coach("poop")
                coach("rat")
                coach("crap")
            }
            //header 2
            Div(attrs = { classes(WebStyleSheet.headerbig); style { textAlign("center") } }) {
                Text("Our Students")
            }
            //sample student
            Div(
                attrs = {
                    style {
                        display(DisplayStyle.Flex)
                        flexDirection(FlexDirection.Column)
                        justifyContent(JustifyContent.SpaceEvenly)
                        width(1236.px)
                        height(424.px)
                        background("rgba(28, 53, 95, 0.53)")
                        borderRadius(20.px)
                        property("box-shadow", "0px 4px 23px 8px rgba(0, 0, 0, 0.25)")
                    }
                }
            ) {
                //name
                Div(attrs = { classes(WebStyleSheet.headersmol); style { textAlign("center") } }) {
                    Text("Jake M")
                }
                Div(attrs = {
                    style {
                        display(DisplayStyle.Flex)
                        flexDirection(FlexDirection.Row)
                        justifyContent(JustifyContent.SpaceEvenly)
                    }
                }) {
                    //profile pic
                    Div(
                        attrs={
                            style{
                                height(200.px)
                                width(800.px)
                                background("red")
                                property("border-radius", "50%")
                                display(DisplayStyle.InlineBlock)
                                padding(20.px)
                            }
                        }
                    ) {

                    }
                    //description
                    Div(attrs={classes(WebStyleSheet.description); style{padding(20.px)}}) {
                        Text("“What separates Poker With Riske from the other coaching I've received before is that the program is incredibly organized and breaks complex ideas into well-structured, implementable heuristics. The community is very active and supportive, and through the program I've become more passionate about poker than I ever was before.”")
                    }

                }
            }
        }
    }

}

@Composable
fun coach(name: String){
    Div(
        attrs = {
            style{
                width(384.px)
                height(555.px)
                background("rgba(28, 53, 95, 0.53)")
                borderRadius(20.px)
                property("box-shadow", "0px 4px 23px 8px rgba(0, 0, 0, 0.25)")
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
                justifyContent(JustifyContent.SpaceEvenly)
            }
        }
    ) {
        Div(attrs={
            style{
                width
            }
        }){
            Text(name)
        }
    }
}