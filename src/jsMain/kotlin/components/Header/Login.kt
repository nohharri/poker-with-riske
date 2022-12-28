package Login

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

@Composable
fun Login(){
    Div (
        attrs = {
            classes(WebStyleSheet.headersmol)
            style {
                textDecoration("underline")
                margin(20.px)

                //padding(20.px)
            }
        }

    ) {
        /*Button(attrs = {
            onClick {LoginModal()}
            }) {*/
            Text("Login")
        //}
    }
}

@Composable
fun LoginModal(){
    Div(attrs={
        style{
            width(100.percent)
            height(100.percent)
            background("rgba(0,0,0,1)")
        }
    }){

    }
}


