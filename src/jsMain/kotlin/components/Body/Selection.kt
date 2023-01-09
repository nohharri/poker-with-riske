package Selection

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.alignSelf
import org.jetbrains.compose.web.css.AlignSelf
import org.jetbrains.compose.web.renderComposable

@Composable
fun Selection() {
    Div(attrs={classes(WebStyleSheet.selectionProcess)}){
        Div(attrs={classes(WebStyleSheet.headerbig);classes(WebStyleSheet.verticalAlign) ;classes(WebStyleSheet.mobileHeader); style{height(200.px) }}){
            Text("Selection Process")
        }
        Div(
            attrs={ classes(WebStyleSheet.box) ; classes(WebStyleSheet.selectionStep) }

        )
        {
            //step 1
            Div(attrs={classes(WebStyleSheet.steps)}){

                Div(attrs={style{margin(20.px)}}){
                    I(attrs={classes("fa-solid") ; classes("fa-file-lines") ; classes(WebStyleSheet.stepIcon)})
                }


                Div(attrs={style{display(DisplayStyle.Flex) ; alignItems(AlignItems.Center) }}){
                    Div(attrs={style{margin(20.px); marginRight(0.px)}}){
                        Div(attrs={classes(WebStyleSheet.smallCircle) ; classes(WebStyleSheet.headersmol)}){
                            Text("1")
                        }
                    }
                    Div(attrs={ classes(WebStyleSheet.headersmol) ; style{margin(20.px)}}){
                        Text("Application Review")
                    }
                }
            }

            //I(attrs={classes("fa-solid") ; classes("fa-arrow-right") ; classes(WebStyleSheet.arrow)})

            //step 2
            Div(attrs={classes(WebStyleSheet.steps)}){

                Div(attrs={style{margin(20.px)}}){
                    I(attrs={classes("fa-solid") ; classes("fa-comments") ; classes(WebStyleSheet.stepIcon)})
                }


                Div(attrs={style{display(DisplayStyle.Flex) ; alignItems(AlignItems.Center) }}){
                    Div(attrs={style{margin(20.px); marginRight(0.px)}}){
                        Div(attrs={classes(WebStyleSheet.smallCircle) ; classes(WebStyleSheet.headersmol)}){
                            Text("2")
                        }
                    }
                    Div(attrs={ classes(WebStyleSheet.headersmol) ; style{margin(20.px)}}){
                        Text("Interview With Our Coaches")
                    }
                }
            }


            //I(attrs={classes("fa-solid") ; classes("fa-arrow-right") ; classes(WebStyleSheet.arrow)})

            //step 3
            Div(attrs={classes(WebStyleSheet.steps)}){

                Div(attrs={style{margin(20.px)}}){
                    I(attrs={classes("fa-solid") ; classes("fa-file-signature") ; classes(WebStyleSheet.stepIcon)})
                }


                Div(attrs={style{display(DisplayStyle.Flex) ; alignItems(AlignItems.Center) }}){
                    Div(attrs={style{margin(20.px); marginRight(0.px)}}){
                        Div(attrs={classes(WebStyleSheet.smallCircle) ; classes(WebStyleSheet.headersmol)}){
                            Text("3")
                        }
                    }
                    Div(attrs={ classes(WebStyleSheet.headersmol) ; style{margin(20.px)}}){
                        Text("Contract Signature")
                    }
                }
            }

        }
    }
}