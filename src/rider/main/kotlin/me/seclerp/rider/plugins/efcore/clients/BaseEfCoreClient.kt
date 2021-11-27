package me.seclerp.rider.plugins.efcore.clients

import me.seclerp.rider.plugins.efcore.commands.CliCommand
import me.seclerp.rider.plugins.efcore.commands.CliCommandBuilder
import me.seclerp.rider.plugins.efcore.commands.CommonOptions

abstract class BaseEfCoreClient {
    protected fun createCommand(command: String, commonOptions: CommonOptions): CliCommand {
        return createCommand(command, commonOptions) { }
    }

    protected fun createCommand(command: String, commonOptions: CommonOptions, customOptionsApplier: CliCommandBuilder.() -> Unit): CliCommand {
        val commandBuilder = CliCommandBuilder(command, commonOptions)
        customOptionsApplier(commandBuilder)

        return commandBuilder.build()
    }
}