package Body

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.alignSelf
import org.jetbrains.compose.web.css.AlignSelf
import org.jetbrains.compose.web.renderComposable

val jakequote = "“What separates Poker With Riske from the other coaching I've received before is that the program is incredibly organized and breaks complex ideas into well-structured, implementable heuristics. The community is very active and supportive, and through the program I've become more passionate about poker than I ever was before.“"
val adamquote = "“I joined the CFP as a semi-recreational small winner at 50nl with a decent grasp of theory but not really able to apply it correctly. Poker With Riske completely transformed the way I think about poker and how to actually apply theory in all kinds of lineups. All the coaches are active players in todays games crushing 500nl+. The combination of knowledge the coaches are able to offer from theory/exploits to playing against recreational players is unbelievable. I'm now currently playing 200nl with 7-8bb/100 with an aim to crush even higher!“"
val chrisquote = "“After a full year in the CFP, I can say without a doubt I wouldn’t be a fraction of the player I am today without Poker With Riske's help. I went from a small winner at 100NL, to beating 500NL. Something that felt completely out of reach a year ago.“"
@Composable
fun Body() {
        Div(
            attrs = { classes(WebStyleSheet.body) ; id("Coaches") }
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
                Div(
                    attrs = {
                        classes(WebStyleSheet.coachBoxes)
                    }
                ) {
                    coach("Ryan Riske")
                    coach("Andrew Ivers")
                    coach("Connor Armstrong")
                }
            //header 2
            Div(attrs = {
                classes(WebStyleSheet.headerbig); classes(WebStyleSheet.verticalAlign); style {
                textAlign("center"); height(200.px) ; //marginTop(80.px)
            }
            }) {
                Text("Our Students")
            }
                //sample student jake
            student("Jake M", jakequote)
            student("Adam", adamquote )
            student("Chris D", chrisquote)





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
            Div(attrs={classes(WebStyleSheet.description) ; style{margin(10.px , 10.px , 0.px, 10.px) ; display(DisplayStyle.Flex)}}){
                Div(attrs={style{marginRight(10.px)}}){
                    I(attrs={classes("fa-solid") ; classes("fa-money-bill")})
                }
                Text("$1,000,000 in Profit")
            }
            Div(attrs={classes(WebStyleSheet.description) ; style{margin(10.px , 10.px , 0.px, 10.px) ; display(DisplayStyle.Flex)}}){
                Div(attrs={style{marginRight(10.px)}}){
                    I(attrs={classes("fa-solid") ; classes("fa-trophy")})
                }
                Text("Toronto Open Winner")
            }
            Div(attrs={classes(WebStyleSheet.description) ;style{ margin(10.px , 10.px , 20.px, 10.px) ; display(DisplayStyle.Flex)}}){
                Div(attrs={style{marginRight(10.px)}}){
                    I(attrs={classes("fa-solid") ; classes("fa-award")})
                }
                Text("2022 Poker Awards")
            }

        }


}

@Composable
fun student(name: String, quote: String) {
    Div(attrs = { classes(WebStyleSheet.box); classes(WebStyleSheet.studentBox) }) {
        //name
        Div(attrs = { classes(WebStyleSheet.headersmol); style { textAlign("center") ; margin(20.px)  } }) {
            Text(name)
        }
        Div(attrs = { classes(WebStyleSheet.studentPicQuote) }) {
            //profile pic
            Div() {
                Div(
                    attrs = {
                        classes(WebStyleSheet.verticalAlign)
                        classes(WebStyleSheet.profilePicPlaceholder)
                    }
                ) {}
            }
            //description
            Div(attrs = {
                classes(WebStyleSheet.description); classes(WebStyleSheet.verticalAlign); style {
                margin(20.px)
                marginBottom(20.px)
            }
            }) {
                Text(quote)
            }

        }
    }



}
