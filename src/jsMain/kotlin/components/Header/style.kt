import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.alignSelf
import org.jetbrains.compose.web.css.AlignSelf

// test



object WebStyleSheet : StyleSheet() {
    val main by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        background("linear-gradient(0deg, #070335 0%, #192F53 100%, #090534  100%)")



    }
    val page by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        width(800.px)
        media("(max-width: 800px)") {
            self style {
                width(100.percent)
            }
        }

    }
    val header by style {
        height(200.px)
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceBetween)
        alignItems(AlignItems.Baseline)
        color(Color.white)
        width(100.percent)
        textAlign("center")

        media("(max-width: 800px)") {
            self style {
                flexDirection(FlexDirection.Column)
                alignItems(AlignItems.Center)
            }
        }
    }
    val banner by style {
        //height(500.px)
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceEvenly)
        color(Color.white)
        //marginBottom(80.px)
        margin(20.px)
        
    }
    val body by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        alignSelf(AlignSelf.Center)
        color(Color.white)
        width(800.px)
        media("(max-width: 800px)") {
            self style {
                width(100.percent)
            }
        }
    }

    //text stuff
    val logo by style {
        fontSize(48.px)
        fontWeight(700)
        property("font-family","Inter,Helvetica")
        margin(20.px)
        color(Color.white)


    }
    val description by style {
        fontSize(18.px)
        fontWeight(500)
        property("font-family","Poppins,Helvetica")
        color(Color.white)

    }
    val headerbig by style {
        fontSize(48.px)
        fontWeight(700)
        property("font-family","Poppins,Helvetica")
        color(Color.white)

    }
    val headersmol by style {
        fontSize(24.px)
        fontWeight(700)
        property("font-family","Poppins,Helvetica")
        color(Color.white)

    }

    val verticalAlign by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        flexDirection(FlexDirection.Column)
    }

    val box by style {
        background("rgba(28, 53, 95, 0.53)")
        borderRadius(20.px)
        property("box-shadow", "0px 4px 23px 8px rgba(0, 0, 0, 0.25), inset 0px 4px 1px rgba(255, 255, 255, 0.25)")
        media("(max-width: 800px)") {
            self style {
            }
        }


    }/* Rectangle 1 */

    val bannerBig by style {
        width(500.px)
        property("height","auto")
        flexDirection(FlexDirection.Column)
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceEvenly)
        media("(max-width: 800px)") {
            self style {
                property("width","auto")
                property("height","auto")
            }
        }

    }
    val bannerImg by style {
        width(300.px)
        property("height","100%")
        media("(max-width: 800px)") {
            self style {
                display(DisplayStyle.None)
            }
        }

    }

    val bannerSmall by style {
        flexDirection(FlexDirection.Row)
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceBetween)
        marginTop(20.px)
        media("(max-width: 800px)") {
            self style {
                flexDirection(FlexDirection.Column)
            }
        }

    }

    val studentBox by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        justifyContent(JustifyContent.SpaceEvenly)

        width(760.px)
        property("height","auto")
        margin(20.px)
        media("(max-width: 800px)") {
            self style {
                property("width","auto")
                property("height","auto")

            }
        }
    }

    val studentPicQuote by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        justifyContent(JustifyContent.SpaceEvenly)
        alignItems(AlignItems.Center)
        media("(max-width: 800px)") {
            self style {

                flexDirection(FlexDirection.Column)

            }
        }
    }

    val profilePic by style {
        height(200.px)
        width(200.px)
        property("border-radius", "50%")
        display(DisplayStyle.InlineBlock)
        margin(20.px)
        alignSelf(AlignSelf.Center)
    }

    val coachBoxes by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        justifyContent(JustifyContent.SpaceEvenly)
        width(100.percent)
        media("(max-width: 800px)") {
            self style {
                flexDirection(FlexDirection.Column)
                property("width", "auto")

            }
        }
    }

    val coachBox by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)

        marginTop(20.px)
        marginBottom(20.px)

        media("(max-width: 800px)") {
            self style {
                width(300.px)

            }
        }
    }
    val applyBox by style {
        textAlign("center")
        background("#F65665")
        marginBottom(20.px)
        property("width", "240px")
        height(65.px)
        media("(max-width: 800px)") {
            self style {
                property("width", "auto")
            }
        }

    }
    val offerBox by style {
        textAlign("center")
        marginBottom(20.px)
        property("width", "240px")
        height(65.px)
        media("(max-width: 800px)") {
            self style {
                property("width", "auto")
            }
        }
    }


    val hoverbox by style {
        self + hover() style {
            property("transition","0.5s")

            property("filter","brightness(1.2)")
        }
    }

    val selectionProcess by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        alignSelf(AlignSelf.Center)


        media("(max-width: 800px)") {
            self style {
                width(100.percent)
            }
        }
    }

    val steps by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)



    }

    val smallCircle by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        height(36.px)
        width(36.px)
        background("white")
        property("color","rgba(28, 53, 95)")
        property("border-radius", "50%")
    }

    val arrow by style {
        fontSize(24.px)
    }
    val stepIcon by style {
        fontSize(48.px)
        color(Color.white)

    }

    val selectionStep by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        margin(20.px)
        width(760.px)
        media("(max-width: 800px)") {
            self style {
                property("width","auto")
                flexDirection(FlexDirection.Column)
            }
        }
    }

    val Elevate by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
        alignSelf(AlignSelf.Center)
        color(Color.white)
    }

    val mobileHeader by style {
        media("(max-width: 800px)") {
            self style {
                textAlign("center")
            }
        }
    }

    val offerSegment by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Center)
    }

    val offerList by style {
        display(DisplayStyle.Flex)
        flexWrap(FlexWrap.Wrap)
        justifyContent(JustifyContent.SpaceEvenly)
        margin(20.px)
        width(760.px)
        media("(max-width: 800px)") {
            self style {
                property("width","auto")
            }
        }
    }

    val offerPortion by style {
        width(180.px)
        height(264.px)
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignContent(AlignContent.Center)


        textAlign("center")


    }

    val offerIcon by style {
        display(DisplayStyle.Flex)
        height(64.px)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        margin(20.px)
    }
    val offerDescription by style {
        flexDirection(FlexDirection.Column)
        height(120.px)
        marginLeft(10.px)
        marginRight(10.px)
    }


}

