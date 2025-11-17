package com.bhaskar.cmpmemeapp.meme_editor.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.bhaskar.cmpmemeapp.core.presentation.MemeTemplate
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun MemeEditorRoot(
    template: MemeTemplate,
    viewmodel: MemeEditorViewModel = koinViewModel()
){

    val state by viewmodel.state.collectAsStateWithLifecycle()

    MemeEditorScreen(
        template = template,
        state = state,
        onAction = viewmodel::onAction
    )
}

@Composable
fun MemeEditorScreen(
    template: MemeTemplate,
    state: MemeEditorState,
    onAction: (MemeEditorAction) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(template.drawable),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
    }
}