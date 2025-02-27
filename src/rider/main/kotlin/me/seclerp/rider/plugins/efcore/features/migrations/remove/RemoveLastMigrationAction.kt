package me.seclerp.rider.plugins.efcore.features.migrations.remove

import com.intellij.openapi.project.Project
import me.seclerp.rider.plugins.efcore.cli.api.models.DotnetEfVersion
import me.seclerp.rider.plugins.efcore.features.shared.BaseCommandAction
import me.seclerp.rider.plugins.efcore.rd.RiderEfCoreModel

class RemoveLastMigrationAction : BaseCommandAction("Removing migration...", "Last migration has been removed") {
    override fun createDialog(
        intellijProject: Project,
        toolsVersion: DotnetEfVersion,
        model: RiderEfCoreModel,
        currentDotnetProjectName: String?
    ) = RemoveLastMigrationDialogWrapper(toolsVersion, intellijProject, currentDotnetProjectName)
}