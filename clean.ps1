$cwd = Get-Location

Set-Location $PSScriptRoot/00-parent

& mvn clean

Set-Location $cwd

$classpaths = Get-ChildItem -Path . -Include .classpath -Recurse -Hidden
foreach($file in $classpaths) {
    Remove-Item $file -Force
}
$projects = Get-ChildItem -Path . -Include .project -Recurse -Hidden
foreach($file in $projects) {
    Remove-Item $file -Force
}
$settings = Get-ChildItem -Path . -Include .settings -Recurse -Hidden
foreach($file in $settings) {
    Remove-Item $file -Recurse -Force
}

Set-Location $PSScriptRoot
Remove-Item $PSScriptRoot/../hsw-gdp-java.zip
& zip -r $PSScriptRoot/../hsw-gdp-java.zip . -x '*.git*' -x '*.DS_Store*'
Set-Location $cwd