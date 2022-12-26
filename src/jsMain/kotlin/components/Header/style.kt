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
        flexDirection(FlexDirection.Row)
        justifyContent(JustifyContent.Center)
        background("linear-gradient(0deg, rgba(2,0,36,1) 0%, rgba(9,9,121,1) 100%, rgba(0,212,255,1) 100%)")


    }
    val page by style {

        width(1400.px)
    }
    val box by style {
        height(200.px)
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceBetween)
        alignItems(AlignItems.Baseline)
        color(Color.white)
    }
    val banner by style {
        height(500.px)
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Stretch)
        color(Color.white)
    }
    val body by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        alignItems(AlignItems.Stretch)
        color(Color.white)
        width(1236.px)
    }

    //text stuff
    val logo by style {
        fontSize(64.px)
        fontWeight(700)
        property("font-family","Inter,Helvetica")
    }
    val description by style {
        fontSize(24.px)
        fontWeight(500)
        property("font-family","Poppins,Helvetica")
    }
    val headerbig by style {
        fontSize(64.px)
        fontWeight(700)
        property("font-family","Poppins,Helvetica")
    }
    val headersmol by style {
        fontSize(36.px)
        fontWeight(700)
        property("font-family","Poppins,Helvetica")
    }

}

