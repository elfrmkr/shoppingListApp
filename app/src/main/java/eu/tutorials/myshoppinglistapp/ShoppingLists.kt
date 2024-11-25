package eu.tutorials.myshoppinglistapp

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ShoppingLists() {
    var title by remember { mutableStateOf("My Shopping List") }

    // Editable Title
    TextField(
        value = title,
        onValueChange = { title = it },
        singleLine = true,
        textStyle = LocalTextStyle.current.copy(fontSize = 24.sp, color = Color.Black),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp)
    )

    Row {
        // Edit Button
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(60.dp),
        ){
            Icon(imageVector = Icons.Filled.Edit, contentDescription = "Edit")
        }

        // Delete Button
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(60.dp),
        ){
            Icon(imageVector = Icons.Filled.Delete, contentDescription = "Delete")
        }
    }
}