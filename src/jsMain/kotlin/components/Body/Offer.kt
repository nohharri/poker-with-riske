package Offer

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.alignSelf
import org.jetbrains.compose.web.css.AlignSelf
import org.jetbrains.compose.web.renderComposable

@Composable
fun Offer() {
    Div(attrs = { classes(WebStyleSheet.offerSegment)  ; id("Offer")} ) {
        //Headline
        Div(attrs={classes(WebStyleSheet.headerbig);classes(WebStyleSheet.verticalAlign) ;classes(WebStyleSheet.mobileHeader); style{height(200.px) }}){
            Text("What We Offer")
        }
        //squares
        Div(
            attrs={ classes(WebStyleSheet.box) ; classes(WebStyleSheet.offerList)}
        ){
            //square 1
            Box("Introductory.png", "Introductory 1:1 coaching session" )
            Box("Additional.png", "Additional one-on-ones based on volume thresholds" )
            Box("2Group.png", "2 group coaching sessions per week" )
            Box("4Addit.png", "4 additional training videos per month" )
            Box("Weekly.png", "Weekly streams featuring a head coach playing mid/high Stakes" )
            Box("Access.png", "Access to our video library, exclusive PDF's, and past training sessions" )
            Box("GTO.png", "GTO preflop ranges/ PIO solver parameters/ HM2 /PT4 HUDS" )
            Box("Community.png", "Community of like-minded  poker players" )
        }
    }
}

@Composable
fun Box(imgpath: String, desc: String) {
    Div(attrs={classes(WebStyleSheet.offerPortion)}){
        Div(attrs={classes(WebStyleSheet.offerIcon)}){
            Img(src=imgpath)
        }
        Div(attrs={classes(WebStyleSheet.description); classes(WebStyleSheet.offerDescription)}){
            Text(desc)
        }
    }
}