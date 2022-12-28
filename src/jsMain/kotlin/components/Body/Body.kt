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
        attrs = { classes(WebStyleSheet.horizontalAlign) ; style {width(100.percent)} ; id("Coaches")}
    ) {

        Div(
            attrs = { classes(WebStyleSheet.body) }
        ) {
            //header 1
            Div(attrs = {
                classes(WebStyleSheet.headerbig); classes(WebStyleSheet.verticalAlign); style {
                textAlign("center"); height(
                200.px
            )
            }
            }) {
                Text("Meet our Coaches")
            }
            //sample coach
            Div(attrs = { classes(WebStyleSheet.horizontalAlign)}) {
                Div(
                    attrs = {
                        classes(WebStyleSheet.coachBoxes)
                    }
                ) {
                    coach("Ryan Riske")
                    coach("Andrew Ivers")
                    coach("Connor Armstrong")
                }
            }
            //header 2
            Div(attrs = {
                classes(WebStyleSheet.headerbig); classes(WebStyleSheet.verticalAlign); style {
                textAlign("center"); height(200.px) ; //marginTop(80.px)
            }
            }) {
                Text("Our Students")
            }
            Div (attrs = { classes(WebStyleSheet.horizontalAlign) }) {
                //sample student
                Div(
                    attrs = { classes(WebStyleSheet.box); classes(WebStyleSheet.studentBox) }
                ) {
                    //name
                    Div(attrs = { classes(WebStyleSheet.headersmol); style { textAlign("center") } }) {
                        Text("Jake M")
                    }
                    Div(attrs = {
                        classes(WebStyleSheet.studentPicQuote)
                        style {

                        }
                    }) {
                        //profile pic
                        Div(attrs = { classes(WebStyleSheet.horizontalAlign) }) {
                            Div(
                                attrs = {
                                    classes(WebStyleSheet.verticalAlign)
                                    classes(WebStyleSheet.profilePicPlaceholder)
                                }
                            ) {

                            }
                        }
                        //description
                        Div(attrs = {
                            classes(WebStyleSheet.description); classes(WebStyleSheet.verticalAlign); style {
                            padding(
                                20.px
                            )
                        }
                        }) {
                            Text("“What separates Poker With Riske from the other coaching I've received before is that the program is incredibly organized and breaks complex ideas into well-structured, implementable heuristics. The community is very active and supportive, and through the program I've become more passionate about poker than I ever was before.”")
                        }

                    }
                }
            }
        }
    }

}

@Composable
fun coach(name: String){
        Div(
            attrs = { classes(WebStyleSheet.box) ; classes(WebStyleSheet.coachBox)

            }
        ) {
            //name
            Div(attrs={
                classes(WebStyleSheet.headersmol)
                style{
                    textAlign("center")
                    margin(10.px)
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
            Div(attrs={classes(WebStyleSheet.description) ; style{margin(10.px , 10.px , 0.px, 10.px)}}){
                Text("$1,000,000 in Profit")
            }
            Div(attrs={classes(WebStyleSheet.description) ; style{margin(10.px , 10.px , 0.px, 10.px)}}){
                Text("Toronto Open Winner")
            }
            Div(attrs={classes(WebStyleSheet.description) ;style{ margin(10.px , 10.px , 20.px, 10.px)}}){
                Text("2022 Poker Awards")
            }

        }


}