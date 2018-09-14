<template>
    <v-app>
        <v-toolbar fixed app :clipped-left="clipped">
            <v-toolbar-title>Frontend</v-toolbar-title>
        </v-toolbar>
        <v-content>
            <v-container fluid>
                <v-slide-y-transition mode="out-in">
                    <v-layout column align-center>
                        <router-view></router-view>
                    </v-layout>
                </v-slide-y-transition>
            </v-container>
        </v-content>
    </v-app>
</template>

<script>
    export default {
        data() {
            return {
                clipped: false,
                drawer: true,
                fixed: false,
                items: [
                    {icon: 'bubble_chart', title: 'Inspire'}
                ],
                miniVariant: false,
                right: true,
                rightDrawer: false,
            }
        }
    }
</script>
