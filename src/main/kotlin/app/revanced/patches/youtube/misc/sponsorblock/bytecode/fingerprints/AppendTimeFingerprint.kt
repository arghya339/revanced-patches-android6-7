package app.revanced.patches.youtube.misc.sponsorblock.bytecode.fingerprints

import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

object AppendTimeFingerprint : MethodFingerprint(
    "V",
    AccessFlags.PUBLIC or AccessFlags.FINAL,
    listOf("L", "L", "L"),
    listOf(
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT_OBJECT,
        Opcode.IGET_OBJECT,
        Opcode.IGET_OBJECT,
        Opcode.CHECK_CAST,
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT_OBJECT,
        Opcode.INVOKE_STATIC,
        Opcode.MOVE_RESULT,
        Opcode.IF_NEZ,
        Opcode.IGET_OBJECT,
        Opcode.IGET_OBJECT,
        Opcode.CHECK_CAST,
        Opcode.INVOKE_VIRTUAL,
        Opcode.RETURN_VOID
    )
)