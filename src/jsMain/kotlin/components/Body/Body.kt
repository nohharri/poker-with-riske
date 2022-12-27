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
            Div(attrs = { classes(WebStyleSheet.headerbig); classes(WebStyleSheet.verticalAlign) ; style { textAlign("center") ; height(200.px)} }) {
                Text("Meet our Coaches")
            }
            //sample coach
            Div(
                attrs = { classes(WebStyleSheet.coachBoxes)
                    style {


                    }
                }
            ) {
                coach("Ryan Riske")
                coach("Andrew Ivers")
                coach("Connor Armstrong")
            }
            //header 2
            Div(attrs = { classes(WebStyleSheet.headerbig); classes(WebStyleSheet.verticalAlign) ; style { textAlign("center") ; height(200.px) } }) {
                Text("Our Students")
            }
            //sample student
            Div(
                attrs = { classes(WebStyleSheet.box) ; classes(WebStyleSheet.studentBox) }
            ) {
                //name
                Div(attrs = { classes(WebStyleSheet.headersmol); style { textAlign("center") } }) {
                    Text("Jake M")
                }
                Div(attrs = { classes(WebStyleSheet.studentPicQuote)
                    style {

                    }
                }) {
                    //profile pic
                    Div(attrs = {classes(WebStyleSheet.horizontalAlign)}) {
                        Div(
                            attrs = {
                                classes(WebStyleSheet.verticalAlign)
                                classes(WebStyleSheet.profilePicPlaceholder)
                            }
                        ) {

                        }
                    }
                    //description
                    Div(attrs={classes(WebStyleSheet.description); classes(WebStyleSheet.verticalAlign) ; style{padding(20.px)}}) {
                        Text("“What separates Poker With Riske from the other coaching I've received before is that the program is incredibly organized and breaks complex ideas into well-structured, implementable heuristics. The community is very active and supportive, and through the program I've become more passionate about poker than I ever was before.”")
                    }

                }
            }
        }
    }

}

@Composable
fun coach(name: String){
    Div(attrs = {classes(WebStyleSheet.horizontalAlign)}){
        Div(
            attrs = { classes(WebStyleSheet.box)
                style{
                    width(384.px)
                    height(555.px)
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Column)
                    justifyContent(JustifyContent.SpaceEvenly)
                    margin(20.px)
                }
            }
        ) {
            //name
            Div(attrs={
                classes(WebStyleSheet.headersmol)
                style{
                    textAlign("center")
                }
            }){
                Text(name)
            }
            //profile pic
            Div(attrs={style{textAlign("center")}}) {
                Div(
                    attrs = {classes(WebStyleSheet.profilePicPlaceholder) }
                ){}
            }
            Div(attrs={classes(WebStyleSheet.description) ; style{textAlign("center")}}){
                Text("$1,000,000 in Profit")
            }
            Div(attrs={classes(WebStyleSheet.description) ; style{textAlign("center")}}){
                Text("Toronto Open Winner")
            }
            Div(attrs={classes(WebStyleSheet.description) ; style{textAlign("center")}}){
                Text("2022 Poker Awards")
            }

        }
    }

}