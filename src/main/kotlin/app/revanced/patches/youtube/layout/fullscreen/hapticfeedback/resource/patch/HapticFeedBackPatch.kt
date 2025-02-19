package app.revanced.patches.youtube.layout.fullscreen.hapticfeedback.resource.patch

import app.revanced.patcher.annotation.Description
import app.revanced.patcher.annotation.Name
import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotations.DependsOn
import app.revanced.patcher.patch.annotations.Patch
import app.revanced.patches.youtube.layout.fullscreen.hapticfeedback.bytecode.patch.HapticFeedBackBytecodePatch
import app.revanced.patches.youtube.misc.settings.resource.patch.SettingsPatch
import app.revanced.shared.annotation.YouTubeCompatibility
import app.revanced.shared.util.resources.ResourceHelper

@Patch
@Name("disable-haptic-feedback")
@Description("Disable haptic feedback when swiping.")
@DependsOn(
    [
        HapticFeedBackBytecodePatch::class,
        SettingsPatch::class
    ]
)
@YouTubeCompatibility
class HapticFeedBackPatch : ResourcePatch {
    override fun execute(context: ResourceContext) {

        /*
         add settings
         */
        ResourceHelper.addSettings2(
            context,
            "PREFERENCE_CATEGORY: REVANCED_SETTINGS",
            "PREFERENCE: LAYOUT_SETTINGS",
            "PREFERENCE_HEADER: FULLSCREEN",
            "SETTINGS: DISABLE_HAPTIC_FEEDBACK"
        )

        ResourceHelper.patchSuccess(
            context,
            "disable-haptic-feedback"
        )
    }
}
