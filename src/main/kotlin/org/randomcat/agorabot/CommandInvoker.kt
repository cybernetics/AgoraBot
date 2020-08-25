package org.randomcat.agorabot

import net.dv8tion.jda.api.events.message.MessageReceivedEvent


interface CommandInvoker {
    /**
     * Invokes the specified command
     */
    fun invokeCommand(event: MessageReceivedEvent, invocation: CommandInvocation)
}

class NullCommandInvoker : CommandInvoker {
    override fun invokeCommand(event: MessageReceivedEvent, invocation: CommandInvocation) {
        /* do nothing */
    }
}
