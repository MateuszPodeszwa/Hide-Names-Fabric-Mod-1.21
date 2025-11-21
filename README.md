
---

**Why I'm Pausing My Minecraft Mod**

To fully understand my motivation, you need a little context. I’ve always been a huge Minecraft fan, and I finally found the courage to start modding when I began university in 2024. My first module was in Java, which was perfect—I could study for school while working on my passion project.

But things have changed. My university course has moved on to C#, and honestly, I prefer it. The workload is getting intense, and I can’t split my focus between Java and C# without burning out or getting confused. I want to be great at what I do, and right now, that means dedicating 100% of my attention to C#.

I still love modding, and I will definitely finish this project with all the planned features in the future. But for now, I’m putting it on the shelf until around 2027/2028. Unless my professors suddenly switch us back to Java (which I hope they don’t, because C# is great), I’m staying focused on .NET.

---

# The <u>**Hide Names**</u> Fabric Mod (1.21)

The **Hide Names** is a simple Fabric mod for Minecraft version 1.21 that removes player name tags. This allows you to enjoy games like hide-and-seek with your friends on servers or LAN without visible player tags.

This mod does not affect compasses, maps, or other tracking-related items. **Only player name tags are removed.**

---

## Mod Download Instructions

1. Download directly from GitHub. To do so, locate **releases** section, and select the very top one. For example: HideNames-Fabric-1.21-alpha-1.0.jar. 
2. Download from https://modrinth.com/mod/hide-names-fabric

## Developer Download Instructions
1. Clone the repository using git clone or by any other means.
2. Ensure you have the **JDK 24** installed.
3. Ensure your IDE and project are set up for **Java 24**.
4. Ensure you have Gradle **8.14** installed.
5. If there is .gradle, .idea or build folders in the root directory, delete them.

---

In the case of any issues, please try to follow these steps:
- Before you do anything, double check Java version. It should be **Java 24** for the Gradle version **8.14**. If you are using **IntelliJ IDEA**, in the project view select ``Ctrl+Shift+Alt+S``.
- Check Run/Debug Configuration if it is set to **Java 24**, `-cp Hide-Names-Fabric-1.21.main` with class `net.fabricmc.devlaunchinjector.Main`.

## Error Troubleshooting

Those are some common errors and their solutions that I encountered while developing this mod. To add more, please create an issue on GitHub.

```
net.fabricmc.loom.util.download.DownloadException: Failed download after 3 attempts
```

- **Check if you have a stable internet connection.**
- **Delete** the **.gradle** folder in your project's root directory. 
- Navigate to **C:\%USERPROFILE%\.gradle\caches\fabric-loom** and delete its contents.
- Check for Antivirus or Firewall Interference
  Security software can sometimes block Gradle from accessing external servers. Temporarily disable your antivirus or firewall and attempt to rebuild the project.

```
dev-launch-injector in pass-through mode, missing or unreadable config file
```
- **Regenerate** the launch.cfg file by running this command `./gradlew genSources`. You can also select the `genSources` task in your IDE and run it.
- **Delete and reimport project** **configuration** (InteliJ IDEA).
  - Close IntelliJ IDEA. 
  - Navigate to your project's root directory. 
  - Delete the .idea folder and all .iml files. 
  - Reopen IntelliJ IDEA and select Open. 
  - Choose your project's **build.gradle** file to reimport the project.
- **Check Run Configurations**: Ensure that the Main class is set to `net.fabricmc.devlaunchinjector.Main` and Verify that the Module classpath is correctly set to your project's main module.
- **Clean and Refresh Gradle Project**: You can run `./gradlew clean` or use the clean task in your IDE to clean the project. After that, refresh the Gradle project to ensure all dependencies are correctly resolved. 
- **Manually Delete loom-cache**. If the issue persists, manually deleting the loom-cache directory can help:
  - Navigate to your project's .gradle directory. 
  - Delete the loom-cache folder. 
  - Rebuild your project using Gradle to regenerate the cache.



## ⚠️ Mod Status: Under Construction (Alpha)

This mod is currently under development and is in an **alpha state**.  
You may download and test it, but please note that it might be unstable, and I hold no responsibility for any issues.

### Current Version
- **Version:** `alpha-1.0`
- **Status:** `Works as Intended` - The mod works perfectly fine, I am still looking for adding new features such as: command toggle for server admins, friend/team lists which will allow team members to see each other. And thus the alpha badge.

### Port to Forge
NO

### Port to older / newer versions
YES.

My plan encompasses versions from 1.20 up to whatever the newest version is available. 
<br />
_Why? - Because there are similar mods for versions 1.19 and lower._

---

## 📌 Development Progress

This is my first Fabric API-based project, and I'm actively learning. Development progress might be slower during this initial phase.

---

## 📬 Contact and Support

Feel free to reach out through:

- [GitHub Issues](https://github.com/MateuszPodeszwa/Hide-Names-Fabric-Mod-1.21/issues) *(recommended)*
- Direct message via GitHub
- [Patreon](https://www.patreon.com/c/mateuszpodeszwa) *(Support me!)*

Your feedback and contributions are welcome!

---

## 🌳 Branch Naming Convention

Branches should follow the naming pattern:

```
purpose_API-version
```

**Example:**

For a mod built for Minecraft 1.20.4 using Fabric API, designed to implement a bucket system:

```
bucket-system_Fabric-1.20.4
```

## 📬 JAR Naming Convention

Mod files should follow the naming pattern:

```
name-modloaderapi-MCversion-state-fileVersion
```

**Example:**

For a mod built for Minecraft 1.20.4 using Fabric API, designed to implement a bucket system in the alpha state:

```
BucketReworked-Fabric-1.20.4-alpha-1.0
```

---
