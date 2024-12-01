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

@Patch
@Name("custom-branding-icon-google-family")
@Description("Changes the YouTube launcher icon (Google Family).")
@DependsOn([SettingsPatch::class])
@YouTubeCompatibility
class CustomBrandingPatch_Google_Family : ResourcePatch {
    override fun execute(context: ResourceContext) {

        IconHelper.customIcon(
            context,
            "google_family"
        )

        ResourceHelper.iconPatchSuccess(
            context,
            "google_family"
        )
    }
}