package com.example.abicompose.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.abicompose.ui.theme.orange
import com.example.abicompose.ui.theme.white

@Composable
fun AuthButton(
    text: String,
    backgroundColor: Color,
    contentColor: Color,
    enabled:Boolean = true,
    onButtonClick: () -> Unit,
    isLoading: Boolean,
    modifier: Modifier = Modifier
) {
    Button(
        modifier = modifier,
        onClick = {
            onButtonClick()
        },
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = contentColor,
            disabledContainerColor = backgroundColor,
            disabledContentColor = contentColor
        ),
        enabled = enabled
    ){
        if(isLoading){
            CircularProgressIndicator(
                color = contentColor,
                modifier = Modifier.size(20.dp)
            )
        }else{
            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}
@Preview(showBackground = true)

@Composable
fun AuthButtonPreview() {
    AuthButton(
        text = "Login",
        backgroundColor = orange,
        contentColor = white,
        onButtonClick = { /*TODO*/ },
        isLoading = true,
        modifier = Modifier
            .fillMaxWidth()
    )
}