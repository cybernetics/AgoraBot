package org.randomcat.agorabot.util

import net.dv8tion.jda.api.requests.restaction.MessageAction

fun MessageAction.disallowMentions() = allowedMentions(emptyList())

typealias DiscordMessage = net.dv8tion.jda.api.entities.Message
