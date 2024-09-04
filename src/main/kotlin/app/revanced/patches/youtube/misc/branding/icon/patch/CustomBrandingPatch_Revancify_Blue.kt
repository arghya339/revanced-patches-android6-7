package app.revanced.patches.youtube.misc.branding.icon.patch

import app.revanced.patcher.annotation.Description
import app.revanced.patcher.annotation.Name
import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotations.DependsOn
import app.revanced.patcher.patch.annotations.Patch
import app.revanced.patches.youtube.misc.settings.resource.patch.SettingsPatch
import app.revanced.shared.annotation.YouTubeCompatibility
import app.revanced.shared.util.resources.IconHelper
import app.revanced.shared.util.resources.ResourceHelper

@Patch(false)
@Name("custom-branding-icon-revancify-blue")
@Description("Changes the YouTube launcher icon (Revancify Blue).")
@DependsOn([SettingsPatch::class])
@YouTubeCompatibility
class CustomBrandingPatch_Revancify_Blue : ResourcePatch {
    override fun execute(context: ResourceContext) {

        IconHelper.customIcon(
            context,
            "revancify_blue"
        )

        ResourceHelper.iconPatchSuccess(
            context,
            "revancify_blue"
        )
    }
}
